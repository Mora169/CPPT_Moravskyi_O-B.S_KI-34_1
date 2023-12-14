def create_matrix(n_ROWS, symbol):
    arr = []
    checking_of_the_array = 0

    for i in range(n_ROWS):
     if checking_of_the_array < n_ROWS // 2:
         for midle_of_rows in range(n_ROWS // 2, 0, -1):
             print("\t", end="")
             
         
         
         for j in range(n_ROWS // 2):
             arr[i][j] = symbol[0]
             print(arr[i][j] + "\t", end="")
            
        
     else:
         arr.append([symbol for _ in range(n_ROWS // 2)])
         for j in range(n_ROWS // 2):
             arr[i][j] = symbol[0]
             print(arr[i][j] + "\t", end="")
     
     checking_of_the_array += 1

    return arr
