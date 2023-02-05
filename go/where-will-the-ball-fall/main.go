package wherewilltheballfall

// import "fmt"

func findBall(grid [][]int) (finalState []int) {
	initialBallState := make([]int, len(grid[0]))
	for i := range initialBallState {
		initialBallState[i] = i
	}

	finalState = findBallRec(grid, initialBallState, 0)
	// fmt.Printf("FINAL STATE: %v\n", finalState)

	return finalState
}

func findBallRec(grid [][]int, currBallState []int, currRow int) (nextBallState []int) {
	row := grid[currRow]

	// fmt.Printf("Before state for %v: %v\n", currRow, currBallState)
	for ballNumber, currentColumn := range currBallState {
		if currBallState[ballNumber] == -1 { // ball stuck, go to next one
			continue
		}

		direction := row[currentColumn]
		if direction == 1 { // if currently going right
			if currentColumn+1 >= len(row) { // directs into right wall
				currBallState[ballNumber] = -1
			} else if row[currentColumn+1] == 1 {
				currBallState[ballNumber] = currentColumn + 1
			} else {
				currBallState[ballNumber] = -1
			}
		} else if direction == -1 {
			if currentColumn-1 < 0 { // directs into left wall
				currBallState[ballNumber] = -1
			} else if row[currentColumn-1] == -1 {
				currBallState[ballNumber] = currentColumn - 1
			} else {
				currBallState[ballNumber] = -1
			}
		}
	}
	// fmt.Printf("After state for %v: %v\n", currRow, currBallState)

	if currRow+1 < len(grid) {
		currBallState = findBallRec(grid, currBallState, currRow+1)
	}

	return currBallState
}
