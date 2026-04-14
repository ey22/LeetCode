class ValidateStackSequences:
    def validate_stack_sequences(self, pushed, popped):
        stack = [pushed[0]]
        i = 0
        j = 0

        while j < len(popped):
            if len(stack) != 0:
                top_element = stack[-1]
            else:
                i += 1
                if i < len(pushed):
                    stack.append(pushed[i])
                    top_element = stack[-1]
            if top_element == popped[j]:
                stack.pop()
                j += 1
            else:
                i += 1
                if i < len(pushed):
                    stack.append(pushed[i])
                else:
                    return False
        if len(stack) == 0:
            return True
        return False



example = ValidateStackSequences()
pushed = [1, 0]
popped = [1, 0]
print(example.validate_stack_sequences(pushed, popped))