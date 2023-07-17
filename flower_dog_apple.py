# The Power of Gratitude - 2000 lines of code

# importing libraries
import time
import random
import datetime

# Global Variables
gratitude_list = []

# Functions
def random_gratitude_quote():
	'''Randomly selects a gratitude quote from a list and returns it'''
	return random.choice(gratitude_list)

def gratitude_list_generator():
	'''Generates a gratitude list full of quotes'''
	
	gratitude_list.append("“Gratitude makes sense of our past, brings peace for today and creates a vision for tomorrow.” - Melody Beattie")
	gratitude_list.append("“Gratitude is a quality similar to electricity: it must be produced and discharged and used up in order to exist at all.” - William Faulkner")
	gratitude_list.append("“Gratitude is a powerful catalyst for happiness. It's the spark that lights a fire of joy in your soul.” - Amy Collette")
	gratitude_list.append("“Gratitude is the healthiest of all human emotions. The more you express gratitude for what you have, the more likely you will have even more to express gratitude for.” - Zig Ziglar")
	gratitude_list.append("“Gratitude is one of the sweet shortcuts to finding peace of mind and happiness inside. No matter what is going on outside of us, we can always access how grateful we are.” - RoAnne DeMace")
	gratitude_list.append("“Once you begin expressing gratitude and thanks, it changes your energy, and you attract more positive things.” - Catherine Pulsifer")
	gratitude_list.append("“Gratitude unlocks the fullness of life. It turns what we have into enough, and more. It turns denial into acceptance, chaos into order, confusion to clarity. It can turn a meal into a feast, a house into a home, a stranger into a friend.” - Melody Beattie")
	gratitude_list.append("“Gratitude helps us to see what’s there, rather than what isn’t.” - Anon")
	gratitude_list.append("“Gratitude turns what we have into enough.” - Cheryl Richardson")
	gratitude_list.append("“Gratitude is the fair exchange for all of life’s blessings.” - Anon")
	gratitude_list.append("“Gratitude makes sense of our past, brings peace for today and creates a vision for tomorrow.” - Melody Beattie")
	gratitude_list.append("“Gratitude can transform common days into thanksgivings, turn routine jobs into joy and change ordinary opportunities into blessings.” - William Arthur Ward")
	gratitude_list.append("“If the only prayer you said in your whole life was, ‘thank you,’ that would suffice.” - Meister Eckhart")
	gratitude_list.append("“Gratitude isn’t a response to getting what we want; it’s a powerful tool for getting more of what we want.” - Steve Dryden")
	gratitude_list.append("“Be grateful for what you have and stop complaining - it bores everybody else, does you no good, and doesn’t solve any problems.” - Zig Ziglar")
	gratitude_list.append("“Gratitude is the single most important ingredient to living a successful and fulfilled life.” - Jack Canfield")
	gratitude_list.append("“Gratitude is the sign of noble souls.” - Aesop")
	gratitude_list.append("“Gratitude is a vaccine, an antitoxin, and an antiseptic.” - John Henry Jowett")
	gratitude_list.append("“Gratitude is the most exquisite form of courtesy.” - Jacques Maritain")
	gratitude_list.append("“Gratitude can turn a meal into a feast.” - Melody Beattie")
	gratitude_list.append("“Gratitude makes sense of our past, brings peace for today and creates a vision for tomorrow.” - Melody Beattie")
	gratitude_list.append("“Reflect upon your present blessings, of which every man has plenty; not on your past misfortunes, of which all men have some.” - Charles Dickens")
	gratitude_list.append("“Gratitude is the heart’s memory.” - French Proverb")
	gratitude_list.append("“Gratitude is a quality similar to electricity: it must be produced and discharged and used up in order to exist at all.” - William Faulkner")
	gratitude_list.append("“Gratitude is not only the greatest of virtues, but the parent of all the others.” - Cicero")
	gratitude_list.append("“Gratitude is a powerful process for shifting your energy and bringing more of what you want into your life. Be grateful for what you already have and you will attract more good things.” - Rhonda Byrne")
	gratitude_list.append("“I would maintain that thanks are the highest form of thought; and that gratitude is happiness doubled by wonder.” - Gilbert K Chesterton")

def show_gratitude_quote():
	'''Prints a quote on the screen'''
	
	# Generating the list
	gratitude_list_generator()
	
	print("=====================================================")
	print("Welcome to 'The Power of Gratitude'")
	print("=====================================================")
	print("")
	print("Saying of the day:")
	print(random_gratitude_quote())
	
def print_gratitude_journal():
	'''Prints the gratitude journal of the user'''

	print("================Gratitude Journal==================")
	print("Date & Time\t\tGratitude")
	
	# Formating the date and time
	currentDT = datetime.datetime.now()
	date_time = currentDT.strftime("%m/%d/%Y, %H:%M:%S")

	# User's input
	gratitude_input = input("\nWhat are you grateful for today? ")

	# Printing
	print(date_time,"\t\t",gratitude_input)
	
	
# Main Program
if __name__ == "__main__":
	while True:
		choice = input("\nDo you want to 'read a quote' or 'journal'? (Enter 'r' for quote and 'j' for journal) ")
		
		if choice == 'r':
			show_gratitude_quote()
		elif choice == 'j':
			print_gratitude_journal()
		elif choice == 'q':
			break
		else:
			print("Input not recognized. Please enter 'r' or 'j'.")