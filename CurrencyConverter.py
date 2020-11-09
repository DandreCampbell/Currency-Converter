import json
import requests
import sys

def currency_converter():
    currency = ["Euros", "Japaense Yen", "British Pound", "Australian Dollar", "Canadian Dollar", "Swiss Franc", "Mexican Pesos", "Chinese Yuan"]
    symbol = ["EUR", "JPY", "GBP", "AUD", "CAD", "CHF", "MXN", "CNY"]

    print("\nSelect One Of The Following Major Currencies To Convert To From USD"
                  + ": \n(Choose the number)\n")

    currencyLength = len(currency)
    symbolLength = len(symbol)

    for x in range(currencyLength):
        print(str(x + 1) + " " + str(currency[x]) + " - " + str(symbol[x]))

    # Takes user's choice to determine which currency to convert to
    choice = input("\nEnter The Number:\n")

    # Takes user's amount in USD
    amount = input("Enter The Amount:\n$")

    # if-else statements based on user's choice and takes the currency symbol as a parameter
    if choice == "1":
        print("\nConverting USD to Euros...\nAmount in Euros: \n")
        finalAmount = float(amount) * conversion_api(symbol[0])
        print("%.2f" % finalAmount)

    elif choice == "2":
        print("\nConverting USD to Japanese Yen...\nAmount in Yen: ")
        finalAmount = float(amount) * conversion_api(symbol[1])
        print("%.2f" % finalAmount)

    elif choice == "3":
        print("\nConverting USD to British Pound...\nAmount in British Pounds: ")
        finalAmount = float(amount) * conversion_api(symbol[2])
        print("%.2f" % finalAmount)

    elif choice == "4":
        print("\nConverting USD to to Austrailian Dollar...\nAmount in Austrailian Dollar: ")
        finalAmount = float(amount) * conversion_api(symbol[3])
        print("%.2f" % finalAmount)

    elif choice == "5":
        print("\nConverting USD to Canadian Dollar...\nAmount in Canadian Dollar: ")
        finalAmount = float(amount) * conversion_api(symbol[4])
        print("%.2f" % finalAmount)

    elif choice == "6":
        print("\nConverting USD to to Swiss Franc...\nAmount in Swiss Francs: ")
        finalAmount = float(amount) * conversion_api(symbol[5])
        print("%.2f" % finalAmount)

    elif choice == "7":
        print("\nConverting USD to to Mexican Pesos...\nAmount in Mexican Pesos: ")
        finalAmount = float(amount) * conversion_api(symbol[6])
        print("%.2f" % finalAmount)

    elif choice == "8":
        print("\nConverting USD to to Chinese Yuan...\nAmount in Chinese Yuan: ")
        finalAmount = float(amount) * conversion_api(symbol[7])
        print("%.2f" % finalAmount)

    # Exits program is user's choice is not an option
    else:
        sys.exit("\nNot a valid number. Rerun Program...");

# Connects to ExchangeRateAPI to pull most current Currency Rate the user is trying to convert to
def conversion_api(currency_symbol):
    url = "https://api.exchangeratesapi.io/latest?base=USD"
    response = requests.get(url)
    symbol_rate = response.json()["rates"][currency_symbol]

    return(symbol_rate)

# Converts Json Object to a printable string
def jprint(obj):
    text = json.dumps(obj, sort_keys=True, indent=4)
    print(text)

# Prints list of all available Currency
def currency_list():
    url = "https://api.exchangeratesapi.io/latest?base=USD"
    response = requests.get(url)
    date = response.json()["date"]
    rate = response.json()["rates"]
    jprint(date)
    jprint(rate)

# Runs program
currency_converter()

#currency_list()
