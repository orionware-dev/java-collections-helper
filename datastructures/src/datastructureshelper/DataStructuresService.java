package datastructureshelper;

import datastructureshelper.buttonevents.UserAnswers;

public class DataStructuresService
{
    public String getResults()
    {
        StringBuilder sb = new StringBuilder();

        if(UserAnswers.needList)
        {
            if(UserAnswers.needUniqueElements)
            {
                if(UserAnswers.needUnsortedAndnUnorderedElements)
                {
                    if(UserAnswers.needConcurrency)
                    {
                        sb.append("Set and CopyOnWriteHashSet");
                    }
                    else
                    {
                        sb.append("Set and HashSet");
                    }
                }
                else if(UserAnswers.needOrderedElements)
                {
                    sb.append("Set and LinkedHashSet");
                }
                else if(UserAnswers.needSortedElements)
                {
                    if(UserAnswers.needReverseIteration)
                    {
                        sb.append("NavigableSet and TreeSet (with comparator)");
                    }
                    else
                    {
                        sb.append("SortedSet and TreeSet (with comparator)");
                    }
                }
            }
            else
            {
                if(UserAnswers.needReverseIteration)
                {
                    if(UserAnswers.needConcurrency)
                    {
                        sb.append("List and CopyOnWriteArrayList");
                    }
                    else
                    {
                        if(UserAnswers.needFastSearching)
                        {
                            sb.append("List and ArrayList");
                        }
                        else
                        {
                            sb.append("List and LinkedList");
                        }
                    }
                }
            }
        }
        else if(UserAnswers.needMapping)
        {
            if(UserAnswers.needUnsortedAndnUnorderedElements)
            {
                if(UserAnswers.needConcurrency)
                {
                    sb.append("ConcurrentMap and ConcurrentHashMap");
                }
                else
                {
                    sb.append("Map and HashMap (allows 1 null)");
                    sb.append("\n");
                    sb.append("Map and WeakHashMap (allows 1 null)");
                    sb.append("\n");
                    sb.append("Map and IdentityHashMap (does not allow nulls)");
                }
            }
            else if(UserAnswers.needOrderedElements)
            {
                sb.append("Map and LinkedHashMap");
            }
            else if(UserAnswers.needSortedElements)
            {
                if(UserAnswers.needReverseIteration)
                {
                    sb.append("NavigableMap and TreeMap (with comparator)");
                }
                else
                {
                    sb.append("SortedMap and TreeMap (with comparator)");
                }
            }
        }
        else if(UserAnswers.needQueue)
        {
            if(UserAnswers.needDequeue)
            {
                sb.append("Deque and LinkedList");
                sb.append("\n");
                sb.append("Deque and ArrayDeque");
            }
            else
            {
                if(UserAnswers.needOrderedElements)
                {
                    sb.append("List and LinkedList (fast add/remove)");
                    sb.append("\n");
                    sb.append("Queue and LinkedList");
                }
                else
                {
                    if(UserAnswers.needConcurrency)
                    {
                        sb.append("BlockingQueue and SynchronousQueue");
                        sb.append("\n");
                        sb.append("Queue and BlockingQueue");
                    }
                    else
                    {
                        sb.append("Queue and LinkedList");
                        sb.append("\n");
                        sb.append("BlockingQueue and DelayQueue (uses timeout)");
                    }
                }
            }
        }

        return sb.toString();
    }
}