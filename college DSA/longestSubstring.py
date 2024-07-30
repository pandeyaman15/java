def longestsubstring(s, k):
    if not s or k == 0:
        return ""

    char_count = {}
    max_length = 0
    start = 0
    max_substring = ""

    for end, char in enumerate(s):
        char_count[char] = char_count.get(char, 0) + 1

        while len(char_count) > k:
            char_count[s[start]] -= 1
            if char_count[s[start]] == 0:
                del char_count[s[start]]
            start += 1

        if end - start + 1 > max_length:
            max_length = end - start + 1
            max_substring = s[start:end+1]

    return max_substring
s = "Mamba"
k = 2
print(longestsubstring(s, k))  