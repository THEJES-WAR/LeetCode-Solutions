bool checkTwoChessboards(char* coordinate1, char* coordinate2) {
    int flag = 0;
    if ((((coordinate1[0] - 'a') + 1) + (coordinate1[1] - '0')) % 2 == 0 &&
        (((coordinate2[0] - 'a') + 1) + (coordinate2[1] - '0')) % 2 == 0) {
        flag = 1;
    }
    else if ((((coordinate1[0] - 'a') + 1) + (coordinate1[1] - '0')) % 2 != 0 &&
        (((coordinate2[0] - 'a') + 1) + (coordinate2[1] - '0')) % 2 != 0) {
        flag = 1;
    }
    return flag;
}