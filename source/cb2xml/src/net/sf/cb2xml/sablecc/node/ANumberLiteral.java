/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.cb2xml.sablecc.node;

import java.util.*;
import net.sf.cb2xml.sablecc.analysis.*;

public final class ANumberLiteral extends PLiteral
{
    private PNumber _number_;

    public ANumberLiteral()
    {
    }

    public ANumberLiteral(
        PNumber _number_)
    {
        setNumber(_number_);

    }
    public Object clone()
    {
        return new ANumberLiteral(
            (PNumber) cloneNode(_number_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumberLiteral(this);
    }

    public PNumber getNumber()
    {
        return _number_;
    }

    public void setNumber(PNumber node)
    {
        if(_number_ != null)
        {
            _number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _number_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_number_);
    }

    void removeChild(Node child)
    {
        if(_number_ == child)
        {
            _number_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_number_ == oldChild)
        {
            setNumber((PNumber) newChild);
            return;
        }

    }
}