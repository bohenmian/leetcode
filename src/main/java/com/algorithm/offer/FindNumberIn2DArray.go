package offer

func findNumberIn2DArray(matrix [][]int, target int) bool {
	i := len(matrix) - 1
	j := 0
	for i >= 0 {
		if j < len(matrix[i]) {
			if matrix[i][j] > target {
				i--
			} else if matrix[i][j] < target {
				j++
			} else if matrix[i][j] == target {
				return true
			}
		} else {
			return false
		}
	}
	return false
}
