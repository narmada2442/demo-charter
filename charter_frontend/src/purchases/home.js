import React, { useState, useEffect } from 'react';
const Home = () => {

    const trStyle = {
        color: 'blue'
    }

    const thStyle = {
        padding: '5px'
    }

    const tdStyle = {
        color: 'green'
    }


    const [error, setError] = useState(null);
    const [isLoaded, setIsLoaded] = useState(false);
    const [users, setUsers] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/getDetails")
            .then(res => res.json())
            .then(
                (data) => {
                    setIsLoaded(true);
                    setUsers(data);
                },
                (error) => {
                    setIsLoaded(true);
                    setError(error);
                }
            )
    }, [])
    if (error) {
        return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
        return <div>Loading...</div>;
    } else {
        return (
            <div>  <b>Customer Reward Details for a Total Spent monthly!!</b>
                <table>
                    <tr style={trStyle}>
                        <th style={thStyle}>Name</th>
                        <th style={thStyle}>Month</th>
                        <th style={thStyle}>Total Spent</th>
                        <th style={thStyle}>Rewards</th>
                    </tr>
                    {users.map((user) => {
                        return (
                            <tr>
                                <td style={tdStyle}>{user.customerName}</td>
                                <td style={tdStyle}>{user.month}</td>
                                <td style={tdStyle}>{user.totalSpent}</td>
                                <td style={tdStyle}>{user.rewardpoints}</td>
                            </tr>
                        )
                    })}
                </table>
            </div>
        );
    }
}
export default Home;