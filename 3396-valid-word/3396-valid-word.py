class Solution(object):
    def isValid(self, word):
        if len(word)<3:
            return False
        v="AEIOUaeiou"
        vflag=cflag=0
        for i in word:
            if vflag==0 and i in v:
                vflag=1
            if cflag==0 and i.isalpha() and i not in v:
                cflag=1
            if (i.isalnum())==False:
                return False
        return vflag==cflag==1
                    