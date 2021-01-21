from flask import render_template
from app import app
from app.models.orders import orders

@app.route('/orders')
def index():
    return render_template('index.html', title='Midworld Pizza Company', orders=orders)

@app.route('/orders/<index>')
def single_order(index):
  chosen_order = orders[int(index)]
  
  return render_template('order.html', order=chosen_order)
