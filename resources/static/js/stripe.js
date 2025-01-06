const stripe = Stripe('pk_test_51QbxKvGfBQ9jc15vEbnUiHtzePH1K3TB8BFimXH93bPv9q8ipFBcj9ZwjtwZZ6a3FG8x0OqQ9kLmV2I0msP42Yvn00GCfzfnLM');
const paymentButton = document.querySelector('#paymentButton');
paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({ sessionId: sessionId })
});