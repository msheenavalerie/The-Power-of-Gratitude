print ("The Power of Gratitude")

-- define global variables and functions
math.randomseed (os.time ())
local GRATEFULNESS = 0

--Function to increase the GRATEFULNESS value by 1
function increaseGratefulness(number) 
	GRATEFULNESS = GRATEFULNESS + number
end

-- Function to generate a random number between min and max
function getRandomNumber(min, max)
	return math.random (min, max)
end

--Function to generate a random positive or negative number
function posNegRandom()
	local randomNum = getRandomNumber(-10, 10)
	if randomNum < 0 then
		return -1 * randomNum
	else
		return randomNum
	end
end

--Function to print message about the current GRATEFULNESS value
function printGratefulnessMsg()
	if GRATEFULNESS > 0 then
		print("Your GRATEFULNESS level is at " .. GRATEFULNESS .. ". You are feeling grateful!")
	elseif GRATEFULNESS < 0 then
		print("Your GRATEFULNESS level is at " .. GRATEFULNESS .. ". You are feeling ungrateful!")
	else
		print("Your GRATEFULNESS level is at " .. GRATEFULNESS .. ". You are feeling neutral.")
	end
end

--While loop to continue increasing GRATEFULNESS until it reaches 10
while GRATEFULNESS < 10 do
	increaseGratefulness(posNegRandom())
	printGratefulnessMsg()
end

print("You have reached a GRATEFULNESS level of 10! You are feeling wholeheartedly thankful. You have experienced the powerful feeling of gratitude!")