package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	// Seed the random number generator
	rand.Seed(time.Now().UnixNano())

	// Create an array of quotes
	quotes := []string{
		"You don't get to choose if you get hurt in this world... but you do have some say in who hurts you. -John Green",
		"Set your life on fire. Seek those who fan your flames. – Rumi",
		"The only way to do great work is to love what you do. – Steve Jobs",
		"Life is 10% what happens to you and 90% of how you react to it. – Charles R. Swindoll",
		"Life is like riding a bicycle. To keep your balance, you must keep moving. – Albert Einstein",
}

	// Randomly select a quote
	fmt.Println(quotes[rand.Intn(len(quotes))])

	// Loop through the array and print each quote
	for _, quote := range quotes {
		fmt.Println(quote)
	}

	// Print the length of the array
	fmt.Println("Number of quotes:", len(quotes))

}