import json
import requests
import sys

def currencyConverter():
    currency = ["Euros", "Japaense Yen", "British Pound", "Australian Dollar", "Canadian Dollar", "Swiss Franc"]
    symbol = ["EUR", "JPY", "GBP", "AUD", "CAD", "CHF"]

    print("\nSelect One Of The Following Major Currencies To Convert To From USD"
                  + ": \n(Choose the number)\n")

    currencyLength = len(currency)
    symbolLength = len(symbol)

    for x in range(currencyLength):
        print(str(x + 1) + " " + str(currency[x]) + " - " + str(symbol[x]))

    #
    choice = input("\nEnter The Number:\n")

    #
    amount = input("Enter The Amount:\n$")

    if choice == "1":
        print("\nConverting USD to Euros...\nAmount in Euros: \n")
        finalAmount = float(amount) * conversionAPI(symbol[0])
        print("%.2f" % finalAmount)

    elif choice == "2":
        print("\nConverting USD to Japanese Yen...\nAmount in Yen: ")
        finalAmount = float(amount) * conversionAPI(symbol[1])
        print("%.2f" % finalAmount)

    elif choice == "3":
        print("\nConverting USD to British Pound...\nAmount in British Pounds: ")
        finalAmount = float(amount) * conversionAPI(symbol[2])
        print("%.2f" % finalAmount)

    elif choice == "4":
        print("\nConverting USD to to Austrailian Dollar...\nAmount in Austrailian Dollar: ")
        finalAmount = float(amount) * conversionAPI(symbol[3])
        print("%.2f" % finalAmount)

    elif choice == "5":
        print("\nConverting USD to Canadian Dollar...\nAmount in Canadian Dollar: ")
        finalAmount = float(amount) * conversionAPI(symbol[4])
        print("%.2f" % finalAmount)

    elif choice == "6":
        print("\nConverting USD to to Swiss Franc...\nAmount in Swiss Francs: ")
        finalAmount = float(amount) * conversionAPI(symbol[5])
        print("%.2f" % finalAmount)

    else:
        sys.exit("\nNot a valid number. Rerun Program...");
      # print("\nNot a valid input. Rerun Program...")

def conversionAPI(currency_symbol):
    url = "https://api.exchangeratesapi.io/latest?base=USD"
    response = requests.get(url)
    #data = response.json()
    #print(data)

    #conversion_rates
    #rate = response.json()["rates"]
    #jprint(rate)

    symbol_rate = response.json()["rates"][currency_symbol]

    return(symbol_rate)

# Converts Json Object to string
def jprint(obj):
    # converts Json Object to string
    text = json.dumps(obj, sort_keys=True, indent=4)
    print(text)

#
currencyConverter()
