// Program to play the hit song "In the Zone"

// Pre-requisites:
extern crate rodio;

use rodio::Source;
use rodio::buffer::SamplesBuffer;

fn main() {
    // Create a Rodio sink.
    let sink = rodio::Sink::new(rodio::default_output_device().unwrap());

    // Set up the samples buffer for the song.
    let samples_buffer = SamplesBuffer::from_fn(44_100, | sample | {
        let mut sample_total = 0.0;

        // Calculate bassline
        for n in 0..44_100 {
            if n % 4 == 0 {
                sample_total += (n as f32 * 0.0005).sin()
            }
        }

        // Calculate drums
        for n in 0..44_100 {
            if n % 16 == 0 {
                sample_total += 0.5
            }
        }

        // Calculate melody
        for n in 0..44_100 {
            if n % 2 == 0 {
                sample_total += (n as f32 * 0.0005).cos()
            }
        }

        // Calculate arpeggio
        for n in 0..44_100 {
            if n % 4 == 0 {
                sample_total += (n as f32 * 0.0005).tanh()
            }
        }

        sample_total = sample_total.min(1.0).max(-1.0);
        sample_total as f32
    });

    // Put the samples buffer into a source and start playing it.
    let source = rodio::source::SamplesSource::new(&samples_buffer);
    sink.append(source);
    sink.play();
}