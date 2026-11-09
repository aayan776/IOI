def mean(arr, arrsize):
    total_sum = 0
    for i in range(0, arrsize):
        total_sum += arr[i]
    return float(total_sum / arrsize)
def median(arr, arrsize):
    sorted(arr)

    if arrsize % 2 != 0:
        return float(arr[int(arrsize/2)])
    return float((arr[int(arrsize - 1/ 2)] + arr[int(arrsize/ 2)]) / 2.0)

arr = [1,4,6,4,2,8,7,9]
arrsize = len(arr)

print("Mean = ", mean(arr, arrsize))
print("Median = ", median(arr, arrsize))