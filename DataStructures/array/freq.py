given_str = '3455567'
visited=[]
for i in given_str:
    print(i)
    # visited[int(i)]=False
print(visited)

for i in given_str:
    if not visited[int(i)]:
        print(i ,'comes ' ,given_str.count(given_str[i]), ' times')
        visited[int(i)]=True








# given_str = '3455567'

# # for i in given_str:
# #    print(given_str.count(i))

