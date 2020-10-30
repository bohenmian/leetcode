package offer

func replaceString(s string) string {
	result := make([]rune, len(s)*3)
	i := 0
	for _, value := range s {
		if value != ' ' {
			result[i] = value
			i++
		} else {
			result[i] = '%'
			result[i + 1] = '2'
			result[i + 2] = '0'
			i = i + 3
		}
	}
	return string(result)[:i]
}
