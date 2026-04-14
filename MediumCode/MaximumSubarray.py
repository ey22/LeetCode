class MaximumSubarray:
    def maximum_subarray(self, nums):
        max_sum = nums[0]
        current_sum = 0

        for n in nums:
            if current_sum < 0:
                current_sum = 0
            current_sum += n
            if max_sum < current_sum:
                max_sum = current_sum
        return max_sum

exp = MaximumSubarray()
nums =[5,4,-1,-7,-8]
print(exp.maximum_subarray(nums))


""""
def maximum_subarray(self, nums):
    total_sum = nums[0]
    i = 0
    while i < len(nums):
        j = i+1
        temp = nums[i]
        while j < len(nums):
            temp += nums[j]
            if temp > total_sum:
                total_sum = temp
            j += 1
        i += 1
    return total_sum
"""






