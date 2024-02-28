
# nominees

nominee1 = input("Enter nominee1")
nominee2  = input("Enter nominee2: ")

nm1_votes = 0
nm2_votes = 0

voter_id = [1,2,3,4,5,6,7,8,9,0]

no_of_voter = len(voter_id)

while True:
    if voter_id == []:
        print("Voting session over")
        if nm1_votes > nm2_votes:
            percent = (nm1_votes/no_of_voter) * 100
            print(nominee1, "has won the election", percent, "%")
            break
        elif nm2_votes >nm1_votes:
            percent = (nm2_votes/no_of_voter) * 100
            print(nominee2,  "has won the election ", percent,"%")
            break
        else:
            print("Both have equal numbers")
            break
    voter = int(input("Enter your voter id: "))
    if voter in voter_id:
        print("Your  vote has been recorded.")
        voter_id.remove(voter)

        print("\n\n")
        print("Give vote to", nominee1, "Press 1")
        print("Give vote to", nominee2, "Press 2")

    print("\n\n")

    vote = int(input("Enter a vote: "))

    if vote == 1:
        nm1_votes += 1
        print(nominee1, "Thanks")
    elif vote == 2:
        nm2_votes += 1
        print(nominee2, "Thank You!")

    elif vote > 2:
        print("Check  Your Vote Again!")

    else:
        print("Your not a voter")
        