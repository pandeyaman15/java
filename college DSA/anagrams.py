from collections import defaultdict

def find_anagrams(s):
   
    anagrams = defaultdict(list)
    for word in s.split():
        sorted_word = "".join(sorted(word))
        anagrams[sorted_word].append(word)

    return [tuple(words) for words in anagrams.values() if len(words) > 1]

# Example usage:
input_string = "cat dog tac god act good"
anagrams = find_anagrams(input_string)
print(anagrams)