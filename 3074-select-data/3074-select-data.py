import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    df =students[students['student_id']==101]
    return df.drop('student_id', axis=1)
    