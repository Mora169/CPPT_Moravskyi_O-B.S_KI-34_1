# Введення розміру квадратної матриці
n_ROWS = int(input("Введіть розмір квадратної матриці: "))

# Перевірка на додатність
if n_ROWS < 0:
    n_ROWS = abs(n_ROWS)
    print("Розмір квадратної матриці є від'ємний, тому ми перевкладемо його в додатній:", n_ROWS)

# Перевірка на парність
if n_ROWS % 2 != 0:
    print("Розмір квадратної матриці збільшений на 1.")
    n_ROWS += 1

# Введення символу-заповнювача
symbol = input("Введіть символ-заповнювач: ")

# Перевірка на правильність введеного символу
if len(symbol) != 1:
    print("\nСимвол-заповнювач введено невірно.")
    exit(0)

# Відкриття файлу для запису
with open("MyFile.txt", "w") as fout:
    # Запис розміру квадратної матриці та символу-заповнювача
    fout.write(f"Розмір квадратної матриці: {n_ROWS}\n")
    fout.write(f"Символ-заповнювач: {symbol}\n")

    arr = []

    for i in range(n_ROWS):
        if i < n_ROWS // 2:
            print("\t" * (n_ROWS // 2),end="" )
            fout.write("\t" * (n_ROWS // 2))

            arr.append(['+' if j == 0 else symbol for j in range(n_ROWS // 2)])

            for j in range(n_ROWS // 2):
               # arr[i][0] = '+'
                arr[i][j] = symbol[0]
                print(arr[i][j] + "\t",end="" )
                fout.write(arr[i][j] + "\t")
                
            print("\n")
            print()
            fout.write("\n")
        else:
            arr.append([symbol for _ in range(n_ROWS)])
            for j in range(n_ROWS):
                if(j<(n_ROWS / 2)):
                    arr[i][j] = symbol[0]
                    print(arr[i][j] + "\t",end="")
                    fout.write(arr[i][j] + "\t")
                    
           
                    
            print("\n")        
             
            print()
            fout.write("\n")

print("Дані були записані в файл MyFile.txt.")