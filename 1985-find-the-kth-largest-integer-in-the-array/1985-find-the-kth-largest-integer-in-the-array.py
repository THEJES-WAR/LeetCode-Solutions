class Solution(object):
    def kthLargestNumber(self, nums, k):
        l = []
        for i in nums:
            l.append(int(i))
        l = sorted(l)
        print(l)
        return str(l[len(nums)-k])
        