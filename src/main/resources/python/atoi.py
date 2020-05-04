class atoi:

    def atoiimpl(self, str):
        strWithoutSpace = str.strip()

        firstc = strWithoutSpace[0]
        if firstc.isdigit() or firstc == '-':
            numberEndIndex = -1
            strLoop = 1
            for c in strWithoutSpace:
                if c.isdigit():
                    strLoop = strLoop + 1
                    numberEndIndex = strLoop
                elif c == '-':
                    continue
                else:
                    break

            strNumber = int(strWithoutSpace[0:numberEndIndex:1])
            if strNumber > 2**32:
                return 2**32
            elif strNumber < -2**31:
                return -2**31
            else:
                return strNumber
        else:
            return 0


print("About to execute")

a = atoi()

result = a.atoiimpl("42")
print('Result 1: ' + str(result))

result = a.atoiimpl("     -42")
print('Result 2: ' + str(result))

result = a.atoiimpl("4193 with words")
print('Result 3: ' + str(result))

result = a.atoiimpl("words and 987")
print('Result 4: ' + str(result))

result = a.atoiimpl("-9128347233")
print('Result 5: ' + str(result))

result = a.atoiimpl("" + str(2**32 + 523123))
print('Result 6: ' + str(result))