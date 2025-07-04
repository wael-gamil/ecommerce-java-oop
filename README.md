<h1>E-Commerce System (Java OOP Project)</h1>

<p>A simple console-based e-commerce system built in Java using object-oriented programming principles.</p>

<h2>Features</h2>
<ul>
  <li>Define products with name, price, quantity</li>
  <li>Handle different product types:
    <ul>
      <li>Expirable products (e.g. Cheese, Biscuits)</li>
      <li>Shippable products with weight (e.g. TV, Mobile)</li>
    </ul>
  </li>
  <li>Add products to a shopping cart</li>
  <li>Perform checkout with:
    <ul>
      <li>Subtotal calculation</li>
      <li>Shipping cost calculation</li>
      <li>Total paid amount</li>
      <li>Balance update</li>
      <li>Error handling for:
        <ul>
          <li>Expired products</li>
          <li>Out-of-stock items</li>
          <li>Insufficient balance</li>
          <li>Empty cart</li>
        </ul>
      </li>
    </ul>
  </li>
  <li>Shipping service displays a shipment summary</li>
</ul>

<h2>Technologies</h2>
<ul>
  <li>Java</li>
  <li>OOP concepts (inheritance, interfaces, encapsulation, polymorphism)</li>
</ul>

<h2>File Structure</h2>
<pre><code>
src/
├── App.java                 // Entry point of the app
├── Product.java             // Base class for all products
├── ExpirableProduct.java    // Subclass for products with expiration
├── Shippable.java           // Interface for shippable products
├── ShippableProduct.java    // Product that can be shipped
├── Customer.java            // Customer with name and balance
└── Cart.java                // Handles cart logic and checkout
</code></pre>

<h2>Sample Output</h2>
<pre><code>
** Checkout receipt **
2x Scratch Card 20.00

----------------------
Subtotal: 20.00
Shipping: 0.00
Total Paid: 20.00
Remaining Balance: 80.00
</code></pre>
