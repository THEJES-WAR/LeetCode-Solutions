char* getEncryptedString(char* s, int k) {
    int size = strlen(s);
    char* str = (char*)malloc(size + 1);
    for (int i = 0; i < size; i++) {
        int ch = (i + k) % size;
        str[i] = s[ch];
    }
    str[size] = '\0';
    return str;
}