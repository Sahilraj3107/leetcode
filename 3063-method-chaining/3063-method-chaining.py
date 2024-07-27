import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    animals = animals.sort_values(by ='weight', ascending=False)
    df = animals[animals['weight']>100]['name']
    df =pd.DataFrame(df,columns=['name'])
    return df
    