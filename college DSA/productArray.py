
def productArray(nums):
 
    length = len(nums)
    result = [1] * length

  
    prefix_product = 1
    for i in range(length):
        result[i] *= prefix_product
        prefix_product *= nums[i]
    suffix_product = 1
    for i in range(length - 1, -1, -1):
        result[i] *= suffix_product
        suffix_product *= nums[i]

    return result
nums = [1, 2, 3, 4]
result = productArray(nums)
print(result)  