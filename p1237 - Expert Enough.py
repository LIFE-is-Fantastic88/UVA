from posixpath import split

from sqlalchemy import true

def db_check(Db_list, P_value):
    checkpoint = 0
    checkpoint_value = ""
    for i in range(len(Db_list)):
        if (P_value >= int(Db_list[i][1]) and P_value <= int(Db_list[i][2])):
            checkpoint+=1
            checkpoint_value = Db_list[i][0]
    if checkpoint==0 or checkpoint > 1:
        return "UNDETERMINED"
    else:
        return checkpoint_value

if __name__ == '__main__':

    T_num = input("")

    for T in range(int(T_num)):
         Db_size = int(input(""))
         Db_list = []
         for D in range(Db_size):
            input_data = input()
            Db_list.append(input_data.split(" "))
    
    Q_num = int(input(""))

    for Q in range(Q_num):
        P_value = int(input())
        print(db_check(Db_list, P_value))
