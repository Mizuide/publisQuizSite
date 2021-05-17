import axios, { AxiosResponse } from 'axios';
import { useState } from "react";
import fetchAnswerParam from "../type/fetchAnswerParam";

const ANSWER_URL: string = "/quizWeb/answer";
const useFetchAnswer: () => [number | undefined, (param: fetchAnswerParam) => void] = () => {
    const [answer, setAnswer] = useState<number>();

    const setFetchAnswer = (param: fetchAnswerParam) => {
        axios.get<number>(ANSWER_URL).then(res => setAnswer(res.data));
        axios.post<void>(ANSWER_URL, { params: param });
    }

    return [answer, setFetchAnswer];
}

export default useFetchAnswer;
