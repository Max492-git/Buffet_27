import requests
x = input("What pokemon do you want? ")
y = "https://pokeapi.co/api/v2/pokemon/" + x
pokemon = requests.get(y).json()


# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print(pokemon["name"])

print(pokemon["types"][0]["type"]["name"])
print(pokemon["abilities"][0]["ability"]["name"])
print(pokemon["past_abilities"][0]["generation"]["name"])
print(pokemon["game_indices"][0]["version"]["name"])
print(pokemon["moves"][0]["move"]["name"])