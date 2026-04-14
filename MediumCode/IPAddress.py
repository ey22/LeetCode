class IPAddress:
    def valid_IP_address(self, queryIP):
        if queryIP == "":
            return "Neither"
        if "." in queryIP:
            splitted = queryIP.split(".")
            if len(splitted) != 4:
                return "Neither"
            for i in splitted:
                try:
                    if not ((1 <= int(i) < 256 and i[0] != "0") or (int(i) == 0 and i == "0")):
                        return "Neither"
                except ValueError:
                    return "Neither"
            return "IPv4"
        elif ":" in queryIP:
            splitted = queryIP.split(":")
            if len(splitted) != 8:
                return "Neither"
            for i in splitted:
                try:
                    if not (1 <= len(i) <= 4 and int(i, 16) >= 0):
                        return "Neither"
                except ValueError:
                    return "Neither"
            return "IPv6"


exp = IPAddress()
#my_ip = "122.111.0j.0"
my_ip = "2001:111:0db8:85a3:111:8A2E:0371:7334"
print(exp.valid_IP_address(my_ip))