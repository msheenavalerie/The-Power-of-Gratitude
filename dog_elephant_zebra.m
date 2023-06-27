%This code provides a simple demonstration of the power of gratitude through a
%series of MATLAB commands.

%Declare a vector containing ten integers from 1 to 10
vector = 1:10;

%Define a function to calculate the sum of the vector
sumVec = @(vec) sum(vec);

%Call the function to calculate the sum of the vector
sumVector = sumVec(vector);

%Print the result on the screen
disp(sumVector);

%Declare a vector containing ten strings of gratitude
gratitudeVec = {'Thank you', 'I am grateful', 'I appreciate it', 'Thanks so much', 'How kind', 'I am touched', 'Thanks a lot', 'I am so thankful', 'My deepest gratitude', 'I owe you a debt of gratitude'};

%Define a function to calculate the length of the gratitude vector
lenGrateful = @(grateful) length(grateful);

%Call the function to calculate the length of the gratitude vector
lengthGrateful = lenGrateful(gratitudeVec);

%Print the result on the screen
disp(lengthGrateful);

%Declare a vector containing ten integers from 1 to 10
repeatedVec = 1:10;

%Define a function to calculate the sum of the repeated vector
sumRepeat = @(repeat) sum(repeat);

%Call the function to calculate the sum of the repeated vector
sumRepeated = sumRepeat(repeatedVec);

%Print the result on the screen
disp(sumRepeated);

%Declare a vector containing ten strings of appreciation
appreciationVec = {'I am truly thankful', 'I am so fortunate', 'I am lucky', 'I give thanks', 'I am amazed', 'I am blessed', 'I am so lucky', 'I feel blessed', 'I owe you my thanks', 'My sincerest gratitude'};

%Define a function to calculate the length of the appreciation vector
lenAppreciate = @(appreciative) length(appreciative);

%Call the function to calculate the length of the appreciation vector
lengthAppreciate = lenAppreciate(appreciationVec);

%Print the result on the screen
disp(lengthAppreciate);

%Declare a vector containing ten integers from 1 to 10
combinedVec = 1:10;

%Define a function to calculate the sum of the combined vector
sumCombined = @(combine) sum(combine);

%Call the function to calculate the sum of the combined vector
sumCombinedVec = sumCombined(combinedVec);

%Print the result on the screen
disp(sumCombinedVec);

%Calculate the total length of the gratitude and appreciation vectors
totalLengthVec = lengthGrateful + lengthAppreciate;

%Print the result on the screen
disp(totalLengthVec);

%Calculate the total sum of the vector and the combined vector
totalSumVec = sumVector + sumCombinedVec;

%Print the result on the screen
disp(totalSumVec);

%Calculate the total sum multiplied by the total length
totalSumMultLength = totalSumVec * totalLengthVec;

%Print the result on the screen
disp(totalSumMultLength);

%Print a message on the screen demonstrating the power of gratitude
disp('The power of gratitude is demonstrated by multiplying the sum of two vectors by the total length of the gratitude and appreciation vectors, producing a value of ' +  string(totalSumMultLength) + '.');