import json
import requests
import sys

def currencyConverter():
    currency = ["Euros", "Japaense Yen", "British Pound", "Australian Dollar", "Canadian Dollar", "Swiss Franc"]
    symbol = ["EUR", "JPY", "GBP", "AUD", "CAD", "CHF"]

    print("\nSelect One Of The Following Major Currencies To Convert To From USD"
                  + ": \n(Choose the number)\n")

    #for(i = 0; i < currency.length; i++) {
    #    System.out.printf("%d %s (%s)\n", i + 1, currency[i], symbol[i])
    #}

    currencyLength = len(currency)
    symbolLength = len(symbol)

    #for x in range(currencyLength):
    #    print((x + 1) + currency[x] + symbol[x])

    #
    choice = input("Enter The Number:\n")

    #
    amount = input("Enter The Amount:\n")

    if choice == "1":
        print("\nConverting USD to Euros...\nAmount in Euros: ")
        # print("%.2f\n", conversionAPI(amount));

    elif choice == "2":
        print("\nConverting USD to Japanese Yen...\nAmount in Yen: ")

    elif choice == "3":
        print("\nConverting USD to British Pound...\nAmount in British Pounds: ")

    elif choice == "4":
        print("\nConverting USD to to Austrailian Dollar...\nAmount in Austrailian Dollar: ")

    elif choice == "5":
        print("\nConverting USD to Canadian Dollar...\nAmount in Canadian Dollar: ")

    elif choice == "6":
        print("\nConverting USD to to Swiss Franc...\nAmount in Swiss Francs: ")

    else:
        sys.exit("\nNot a valid choice. Rerun Program...");
      # print("\nNot a valid input. Rerun Program...")

    # url = "https://api.exchangeratesapi.io/latest?base=USD"
    # response = requests.get(url)
    # data = response.json()
    # print(data)

currencyConverter()
