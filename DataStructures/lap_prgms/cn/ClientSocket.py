from socket import *
ServerName = "192.168.43.1"
ServerPort = 12000
ClientSocket = socket(AF_INET,SOCK_DGRAM)
# msg = input('Enter the msg')
msg= "Hello, World!"
print("message: %s" % msg)
ClientSocket.sendto(msg.encode(), (ServerName,ServerPort))
print("msg sent")
response ,server_add= ClientSocket.recvfrom(2048)
print("msg recieving")
print(response.decode())
ClientSocket.close()