import random

random_number = random.randint(100, 999)
value = 0xA + random_number
# keys = ['\uA980', '\uA981', '\uA982', '\uA983', '\uA984', '\uA985', '\uA986', '\uA987', '\uA988', '\uA989']
keys = []
code = value

for i in range(1, 1000):
    keys.append(chr(code + i))

# keys = ['i', 'I', 'l']

print(f"{'|'.join(keys)}")

result = set()

for o in range(1, 100000):
    # 长度 7- 13 位
    for length in range(0, 1):
        # 按照长度随机拼接
        temp = keys[random.randint(0, len(keys) - 1)]
        for i in range(1, length + 1):
            temp += random.choice(keys)
        result.add(temp)

print("成功生成字典，数量：", len(result))

with open("proguard-keys.txt", mode='w+', encoding='utf-8') as f:
    f.writelines("\n".join(result))
