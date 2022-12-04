from tkinter import *

PassBook=Tk()
PassBook.title("PassBook")
PassBook.geometry("750x500")


def Add_Money1():
    pass

def Withdraw_Money1():
    pass

def Check_Balance1():
    pass




Add_money=Button(PassBook,text="Add Money",bg="#98AFC7",fg="black",activebackground="#52595D",state='disabled',command=Add_Money1)
Add_money.pack()

Withdraw_Money=Button(PassBook,text="Withdrow Money", bg="#98AFC7",fg="black",activebackground="#52595D",state='disabled',command=Withdraw_Money1)
Withdraw_Money.pack()

Check_Balance=Button(PassBook,text="Check Balance",bg="#98AFC7",fg="black",activebackground="#52595D",state="disabled",command=Check_Balance1)
Check_Balance.pack()



PassBook.mainloop()
