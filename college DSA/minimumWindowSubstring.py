def min_window(s, t):
    if not s or not t:
        return ""

    t_count = {}
    for char in t:
        if char in t_count:
            t_count[char] += 1
        else:
            t_count[char] = 1

    required_chars = len(t_count)
    formed_chars = 0

    window_counts = {}
    left = 0
    min_len = float("inf")
    min_window = ""

    for right in range(len(s)):
        char = s[right]
        if char in t_count:
            if char in window_counts:
                window_counts[char] += 1
            else:
                window_counts[char] = 1

            if window_counts[char] == t_count[char]:
                formed_chars += 1

        while formed_chars == required_chars and left <= right:
            char = s[left]

            if right - left + 1 < min_len:
                min_len = right - left + 1
                min_window = s[left:right + 1]

            if char in t_count:
                window_counts[char] -= 1
                if window_counts[char] < t_count[char]:
                    formed_chars -= 1

            left += 1

    return min_window