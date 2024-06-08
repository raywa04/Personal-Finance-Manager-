import React, { useState, useEffect } from 'react';
import TransactionService from '../services/TransactionService';

function Transactions({ userId }) {
    const [transactions, setTransactions] = useState([]);

    useEffect(() => {
        TransactionService.getTransactionsByUserId(userId).then((response) => {
            setTransactions(response.data);
        });
    }, [userId]);

    return (
        <div>
            <h2>Transactions</h2>
            <ul>
                {transactions.map((transaction) => (
                    <li key={transaction.id}>
                        {transaction.date}: {transaction.description} - ${transaction.amount}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default Transactions;
