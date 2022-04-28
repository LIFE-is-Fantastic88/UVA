from operator import itemgetter
from itertools import groupby

def index_continuity_check(index_result):
    data = index_result
    ranges =[]

    for k,g in groupby(enumerate(data),lambda x:x[0]-x[1]):
        group = (map(itemgetter(1),g))
        group = list(map(int,group))
        ranges.append((group[0],group[-1]))

    return ranges

def str_to_index(x,y,block):
    index_box_outer = []
    
    for p in range(x):
        index_box_inner = []
        for q in range(y):
            if(block[p][q] == "False"):
                index_box_inner.append(q + 1)
        index_box_outer.append(index_box_inner)
    return index_box_outer

if __name__ == '__main__':
    initial_input = ""
    while True:
        initial_input = input("")
        if initial_input == "0":
            break
        xy_axis = initial_input.split(" ")
        block = [["False" for i in range(int(xy_axis[1]))] for j in range(int(xy_axis[0]))]
        sculpted_block = input("")
        sculpted_block_list = sculpted_block.split(" ")

        for j in range(len(block)):
            for i in range(len(sculpted_block_list)):
                if int(sculpted_block_list[i]) >= (int(xy_axis[0])-j):
                    block[j][i]="True"
        
        index_result = str_to_index(int(xy_axis[0]),int(xy_axis[1]),block)

        total_sculpt = 0
        for m in index_result:
            total_sculpt+=len(index_continuity_check(m))
        print(total_sculpt)
        
