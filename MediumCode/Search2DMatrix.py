class Search2DMartix:
    def search_matrix(self, matrix, target):
        """
        for i in matrix:
            for j in i:
                if j == target:
                    return True
                elif target > j:
                    j += 1
                else:
                    j -= 1
        return False
        """
        for i in matrix:
            if target in i:
                return target
        return False


exp = Search2DMartix()
matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
print(exp.search_matrix(matrix, 12))