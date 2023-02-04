package spiralmatrix

import "fmt"

func spiralOrder(matrix [][]int) (result []int) {
	if len(matrix) == 0 {
		return []int{}
	}
	if m(matrix) == 1 { // base case, single row left
		return matrix[0]
	}
	if n(matrix) == 1 {
		_, c := extractColumn(matrix, 0)
		return c
	}

	result = make([]int, 0, n(matrix)*m(matrix))

	// Step 1: Take first row
	matrix, row := extractRow(matrix, 0)
	result = append(result, row...)
	fmt.Printf("  step 1 (%v):\n  %v\n", result, matrix)

	// Step 2: Take last column
	matrix, col := extractColumn(matrix, n(matrix)-1)
	result = append(result, col...)
	fmt.Printf("  step 2 (%v):\n  %v\n", result, matrix)

	// Step 3: Take last row and reverse
	if len(matrix) > 0 {
		matrix, row = extractRow(matrix, m(matrix)-1)
		result = append(result, reverseRow(row)...)
		fmt.Printf("  step 3 (%v):\n  %v\n", result, matrix)
	}

	// Step 4: Take first col and reverse
	matrix, col = extractColumn(matrix, 0)
	result = append(result, reverseRow(col)...)
	fmt.Printf("  step 4 (%v):\n  %v\n", result, matrix)

	return append(result, spiralOrder(matrix)...)
}

func m(matrix [][]int) int {
	return len(matrix)
}

func n(matrix [][]int) int {
	if m(matrix) == 0 {
		return 0
	}

	return len(matrix[0])
}

func reverseRow(row []int) (reversedRow []int) {
	reversedRow = make([]int, 0, len(row))

	for i, _ := range row {
		reversedRow = append(reversedRow, row[len(row)-i-1])
	}

	return reversedRow
}

func extractRow(matrix [][]int, rowIndex int) (newMatrix [][]int, row []int) {
	newMatrix = make([][]int, 0, len(matrix)-1)
	for i, r := range matrix {
		if i == rowIndex {
			row = r
		} else {
			if len(r) == 0 {
				continue
			}
			newMatrix = append(newMatrix, r)
		}
	}

	return newMatrix, row
}

func extractColumn(matrix [][]int, colIndex int) (newMatrix [][]int, col []int) {
	newMatrix = make([][]int, 0, len(matrix))

	for _, r := range matrix {
		newRow := make([]int, 0, len(r)-1)
		col = append(col, r[colIndex])

		for cI, v := range r {
			if cI == colIndex {
				continue
			}
			newRow = append(newRow, v)

		}

		newMatrix = append(newMatrix, newRow)
	}

	return newMatrix, col
}
