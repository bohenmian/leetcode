package offer

func findRepeatNumber(nums []int) int {

	m := make(map[int]bool)
	for _, value := range nums {
		if m[value] {
			return value
		} else {
			m[value] = true
		}
	}
	return -1
}

func findRepeatNumberOtherWay(nums []int) int {
	for index, num := range nums {
		if index == num {
			continue
		}
		if nums[index] == num {
			return num
		}
		nums[num], nums[index] = nums[index], nums[num]
	}
	return 0
}
