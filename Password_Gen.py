"""A Random Password Generator Using Python """

import random
import string

def generate_password(length):
    characters = string.ascii_letters + string.digits
    password = ''.join(random.choice(characters) for _ in range(length))
    return password

def main():
    length = int(input("Enter the desired length of the password: "))
    if length <= 0:
        print("Length should be greater than 0.")
    else:
        password = generate_password(length)
        print("Generated Password:", password)

main ()


