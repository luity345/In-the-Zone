#!/usr/bin/perl

#Start of code

use strict;
use warnings;

my @in_the_zone;

# inserting strings of words into an array 
@in_the_zone = (
	"Let me take you there"
	"In the zone",
	"It's the place to be", 
	"You can see the stars",
	"You can make your dreams come true",
	"Live life in the moment and seize the day",
	"You can lead the way",
	"The sky is wide open", 
	"Unlock the door and let it be",
	"You can fly away",
	"Do what you need to do to feel alive",
	"Take it to the edge, don't let the fear take over you",
	"It's time to break the boundaries and set yourself free",
	"No one can stop you when you're in the zone",
	"Jump in the deep end, take the ultimate plunge",
	"There's no limit to the possibilities",
	"Be brave and find your own destiny",
	"Life's an adventure, make sure you take it",
	"Jump on the ride and never look back",
	"You never know what's waiting around the corner",
	"Go now and explore the unknown land",
	"Cross the bridge and never look down",
	"Gather your courage and look up to the sky",
	"It's time to take your life in your own hands",
	"You're strong, you're brave, you're ready to go",
	"Don't let anyone hold you back, you know the way",
	"Take the first step and never look back",
	"You'll reach the sky, just never forget",
	"In the zone, you can be anything you want",
	"Your dreams are yours and in your control",
	"Don't let anyone tell you otherwise",
	"Strive for success and reach for your goals",
	"Your destiny is yours to create",
	"The future's yours to make",
	"In the zone, you can make it happen",
	"You'll never know where the road will take you",
	"But you know in your heart it will be the journey of a lifetime",
	"This is your chance to make a difference",
	"So take a chance, reach for the stars, and never let go",
	"The power lies within you, take control of it",
	"And never forget you can make it happen",
	"In the zone, your dreams are the only limits"
);
 
# looping through array
foreach my $zone (@in_the_zone) {
	 print "$zone\n";
}

# End of code