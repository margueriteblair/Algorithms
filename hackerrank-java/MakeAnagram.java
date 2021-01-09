


int[] freq = new int[26];
a.chars().forEach((c) -> {
    freq[c - 97]++;
});
b.chars().forEach((c) -> {
    freq[c - 97]--;
});

return Arrays.stream(freq).map(Math::abs).sum();
