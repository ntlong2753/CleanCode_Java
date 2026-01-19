public class TennisGame {

    private static final int SCORE_LOVE = 0;
    private static final int SCORE_FIFTEEN = 1;
    private static final int SCORE_THIRTY = 2;
    private static final int SCORE_FORTY = 3;

    public static String getScore(String player1Name, String player2Name,
                                  int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            return getEqualScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getEndGameScore(player1Score, player2Score);
        } else
            return getNormalScore(player1Score, player2Score);
    }

    public static String getEqualScore(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love-All";
            case SCORE_FIFTEEN:
                return "Fifteen-All";
            case SCORE_THIRTY:
                return "Thirty-All";
            case SCORE_FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getEndGameScore(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;

        if (minusResult == 1) return "Advantage player1";
        if (minusResult == -1) return "Advantage player2";
        if (minusResult >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getNormalScore(int player1Score, int player2Score) {
        return getScoreName(player1Score) + " - " + getScoreName(player2Score);
    }

    private static String getScoreName(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love";
            case SCORE_FIFTEEN:
                return "Fifteen";
            case SCORE_THIRTY:
                return "Thirty";
            case SCORE_FORTY:
                return "Forty";
            default:
                return "";
        }
    }
}