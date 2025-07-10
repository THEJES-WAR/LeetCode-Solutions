class Solution(object):
    def k(self,l):
        if len(l)==1:
            return l[0]
        l[len(l)-2]=abs(l[len(l)-1]-l[len(l)-2])
        l=l[:len(l)-1]
        return self.k(sorted(l))
    def lastStoneWeight(self, stones):
        l=stones
        l=sorted(l)
        return self.k(l)
        