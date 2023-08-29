from tkinter import *

def calculate_expression():
    try:
        expression = entry.get()
        result = eval(expression)
        entry.delete(0, END)
        entry.insert(0, str(result))
    except Exception as e:
        entry.delete(0, END)
        entry.insert(0, "Erro")

def clear_entry():
    entry.delete(0, END)

def delete_last():
    current_text = entry.get()
    entry.delete(0, END)
    entry.insert(0, current_text[:-1])

root = Tk()
root.title("Calculadora")

entry = Entry(root, width=40, borderwidth=8)
entry.grid(row=0, column=0, columnspan=4)

buttons = [
    "7", "8", "9", "/",
    "4", "5", "6", "*",
    "1", "2", "3", "-",
    "0", ".", "=", "+",
    "DEL", "⌫"
]

row_val = 1
col_val = 0

for button in buttons:
    if button == "DEL":
        Button(root, text=button, padx=20, pady=20, command=clear_entry).grid(row=row_val, column=col_val)
    elif button == "⌫":
        Button(root, text=button, padx=20, pady=20, command=delete_last).grid(row=row_val, column=col_val)
    elif button == "=":
        Button(root, text=button, padx=20, pady=20, command=calculate_expression).grid(row=row_val, column=col_val)
    else:
        Button(root, text=button, padx=20, pady=20, command=lambda b=button: on_button_click(b)).grid(row=row_val, column=col_val)
    col_val += 1
    if col_val > 3:
        col_val = 0
        row_val += 1

def on_button_click(value):
    current_text = entry.get()
    entry.delete(0, END)
    entry.insert(0, current_text + value)

root.mainloop()
