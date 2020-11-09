def test():
    currency = ["Euros", "Japaense Yen", "British Pound", "Australian Dollar", "Canadian Dollar", "Swiss Franc"]
    symbol = ["EUR", "JPY", "GBP", "AUD", "CAD", "CHF"]

    print("\nSelect One Of The Following Major Currencies To Convert To From USD"
                  + ": \n(Choose the number)\n")

    #for(i = 0; i < currency.length; i++) {
    #    System.out.printf("%d %s (%s)\n", i + 1, currency[i], symbol[i])
    #}

    currencyLength = len(currency)
    symbolLength = len(symbol)

    for x in range(currencyLength):
        print((x + 1) + currency[x] + symbol[x])

test()
