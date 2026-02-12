class Solution(object):
    def findWords(self, words):
        l=["qwertyuiop","asdfghjkl","zxcvbnm"]
        m=[]
        for word in words:
            x = word
            word = word.lower()
            for key in l:
                c = 0
                for letters in word:
                    if letters not in key:
                        break
                    else:
                        c+=1
                if c==len(word):
                    m.append(x)
                    
        return m        