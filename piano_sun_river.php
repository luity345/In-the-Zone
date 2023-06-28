<?php

// lines 1-200

// define variables
$video_title = 'In the Zone';
$album_title = 'In the Zone';
$artist_name = 'Britney Spears';
$release_date = 'November 12, 2003';

// output video title
echo '<h1>' . $video_title . '</h1>';

// output album title, artist name and release date
echo '<p>' . $album_title . ' by ' . $artist_name . ' was released on ' . $release_date . '</p>';

// define URL constants
define('VIDEO_URL', 'https://www.youtube.com/watch?v=UzzVjBEBBgw');
define('ALBUM_URL', 'https://open.spotify.com/album/2S1S9A7hzC4jEOSe5gJQ1x');

// output video and album URLs
echo '<a href="' . VIDEO_URL . '">Watch the music video</a><br />';
echo '<a href="' . ALBUM_URL . '">Listen to the album</a><br />';

// define constants for song titles
define('SONG_1', 'Me Against the Music');
define('SONG_2', 'Toxic');
define('SONG_3', 'Showdown');
define('SONG_4', 'Breathe On Me');
define('SONG_5', 'Early Mornin\'');
define('SONG_6', 'Tough Lover');
define('SONG_7', 'Outrageous');
define('SONG_8', 'Touch of My Hand');
define('SONG_9', 'The Hook Up');
define('SONG_10', 'Shadow');
define('SONG_11', 'Brave New Girl');
define('SONG_12', 'Everytime');
define('SONG_13', 'The Answer');
define('SONG_14', 'Don\'t Hang Up');

// output song titles
echo '<h2>Track Listing</h2>';
echo '<ul>';
echo '<li>' . SONG_1 . '</li>';
echo '<li>' . SONG_2 . '</li>';
echo '<li>' . SONG_3 . '</li>';
echo '<li>' . SONG_4 . '</li>';
echo '<li>' . SONG_5 . '</li>';
echo '<li>' . SONG_6 . '</li>';
echo '<li>' . SONG_7 . '</li>';
echo '<li>' . SONG_8 . '</li>';
echo '<li>' . SONG_9 . '</li>';
echo '<li>' . SONG_10 . '</li>';
echo '<li>' . SONG_11 . '</li>';
echo '<li>' . SONG_12 . '</li>';
echo '<li>' . SONG_13 . '</li>';
echo '<li>' . SONG_14 . '</li>';
echo '</ul>';

// define lyrics for song 1
$lyrics_song_1 = 'Hey Britney
What\'s up?

Can we go toe to toe
Let\'s go head to head
And get ready to rumble

You and me
It\'s me against the music';

// output lyrics for song 1
echo '<h2>Lyrics - ' . SONG_1 . '</h2>';
echo '<p>' . $lyrics_song_1 . '</p>';

// define lyrics for song 2
$lyrics_song_2 = 'Toxic, I\'m slipping under
With a taste of a poison paradise
I\'m addicted to you
Don\'t you know that you´re toxic

And I love what you do
Don\'t you know that you´re toxic';

// output lyrics for song 2
echo '<h2>Lyrics - ' . SONG_2 . '</h2>';
echo '<p>' . $lyrics_song_2 . '</p>';

// define lyrics for song 3
$lyrics_song_3 = 'Oh, it\'s a showdown
It\'s a revolution
It\'s a one man show
It\'s a showdown
It might lead to a revolution

Ooh, it\'s a showdown
It\'s a revolution
It\'s a one man show
It\'s a showdown
And it\'s gonna lead to a revolution';

// output lyrics for song 3
echo '<h2>Lyrics - ' . SONG_3 . '</h2>';
echo '<p>' . $lyrics_song_3 . '</p>';

// define lyrics for song 4
$lyrics_song_4 = 'Breathe on me
Take me in
Let me feel that
Sexual healing

Fill me up
Make me come alive
Feel that sensual
Sexual high';

// output lyrics for song 4
echo '<h2>Lyrics - ' . SONG_4 . '</h2>';
echo '<p>' . $lyrics_song_4 . '</p>';

// define lyrics for song 5
$lyrics_song_5 = 'It\'s four in the morning
I know where I\'m going
Going to a place
Where I can be free

From the need of a man
Only me and my band
On the road again
Doin\' it my way';

// output lyrics for song 5
echo '<h2>Lyrics - ' . SONG_5 . '</h2>';
echo '<p>' . $lyrics_song_5 . '</p>';

// define lyrics for song 6
$lyrics_song_6 = 'Make-believe, fantasy
Lies many days away
He won\'t leave you broken
He\'s just here to stay

It\'s love for me and him
And wherever we begin
It\'s gotta be just that
It\'s a tough, tough love';

// output lyrics for song 6
echo '<h2>Lyrics - ' . SONG_6 . '</h2>';
echo '<p>' . $lyrics_song_6 . '</p>';

// define lyrics for song 7
$lyrics_song_7 = 'Outrageous, outrageous
Living that way it\'s contagious
Outrageous, outrageous
Doing it every day it\'s outrageous';

// output lyrics for song 7
echo '<h2>Lyrics - ' . SONG_7 . '</h2>';
echo '<p>' . $lyrics_song_7 . '</p>';

// define lyrics for song 8
$lyrics_song_8 = 'Feeling, it\'s overwhelming
When your body\'s craving
For the touch of my hand
Can\'t you understand

I believe in taking chances
Let the music make you dance
For the touch of my hand
Oh, you understand';

// output lyrics for song 8
echo '<h2>Lyrics - ' . SONG_8 . '</h2>';
echo '<p>' . $lyrics_song_8 . '</p>';

// define lyrics for song 9
$lyrics_song_9 = 'Can you feel the rhythm
Can you feel my heat
I\'m all alone
And you can be my treat

So come on over
Be my one and only
Let\'s hook up tonight
And make love nonstop';

// output lyrics for song 9
echo '<h2>Lyrics - ' . SONG_9 . '</h2>';
echo '<p>' . $lyrics_song_9 . '</p>';

// define lyrics for song 10
$lyrics_song_10 = 'Follow me to the place
Where love can save the day
We\'ll be marching right in
To the shadow of love

And all the way back
To the other side
Where I can hide
In the shadow of love';

// output lyrics for song 10
echo '<h2>Lyrics - ' . SONG_10 . '</h2>';
echo '<p>' . $lyrics_song_10 . '</p>';

// define lyrics for song 11
$lyrics_song_11 = 'Everything is gonna be alright
I\'m gonna be brave tonight
Gonna take the world by storm
Gonna find out who I am

Gonna be brave, make the change
Gonna go out and be the brave new girl';

// output lyrics for song 11
echo '<h2>Lyrics - ' . SONG_11 . '</h2>';
echo '<p>' . $lyrics_song_11 . '</p>';

// define lyrics for song 12
$lyrics_song_12 = 'Everytime I try to fly
I fall without my wings
I feel so small
I guess I need you baby

And everytime I see you in my dreams
I see your face, it\'s haunting me
I guess I need you baby';

// output lyrics for song 12
echo '<h2>Lyrics - ' . SONG_12 . '</h2>';
echo '<p>' . $lyrics_song_12 . '</p>';

// define lyrics for song 13
$lyrics_song_13 = 'Do you understand
What I\'m trying to say
Can you feel the things
I do for you today

Can you feel it in your heart
Can you feel it in your soul
Can you feel the power of love
The love that will never grow old';

// output lyrics for song 13
echo '<h2>Lyrics - ' . SONG_13 . '</h2>';
echo '<p>' . $lyrics_song_13 . '</p>';

// define lyrics for song 14
$lyrics_song_14 = 'Don\'t hang up on me
I won\'t hang up on you
We gotta make it through
What our hearts tell us to do

Gotta keep goin\', keep it goin\', ain\'t no stopping
When the feeling\'s strong
Don\'t hang up on me
Don\'t hang up on me';

// output lyrics for song 14
echo '<h2>Lyrics - ' . SONG_14 . '</h2>';
echo '<p>' . $lyrics_song_14 . '</p>';

?>