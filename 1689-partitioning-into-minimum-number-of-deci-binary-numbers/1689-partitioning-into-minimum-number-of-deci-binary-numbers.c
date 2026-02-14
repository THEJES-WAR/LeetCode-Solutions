int minPartitions(char* n) 
{
    int a=strlen(n);
    char max='0';
    for(int i=0;i<a;i++)
    {
        max=(max<n[i])?n[i]:max;
    }
    return max-'0';
}